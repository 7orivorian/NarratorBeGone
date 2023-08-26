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