package net.baighasan.firstmod;

import net.fabricmc.api.ClientModInitializer;

public class FirstModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hello from the client side!");
    }
}
