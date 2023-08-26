/*
 * Copyright 2023 7orivorian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.tori.narratorbegone.mixin;

import net.minecraft.client.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author <b><a href="https://github.com/7orivorian">7orivorian</a></b>
 * @since <b>1.0.0</b>
 */
@Mixin(Keyboard.class)
public class MixinKeyboard {

    @Inject(
            method = "onKey(JIIII)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/option/SimpleOption;setValue(Ljava/lang/Object;)V",
                    shift = At.Shift.BEFORE,
                    ordinal = 1
            ),
            cancellable = true
    )
    public void narratorbegone$disableKeybind(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        ci.cancel();
    }
}