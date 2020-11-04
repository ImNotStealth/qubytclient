# Qubyt Client
An addon to Optifine's Zoom

Result: https://gyazo.com/8ca9d2e6b26431aa035a2d8f9fcf5922

Legend:
- (GH) file associated with the repo

The steps might be a bit hard to follow, so if you have a problem just ping me on ESS

Steps:
- Go to net.minecraft.client.renderer.EntityRenderer.java and search for "Config.zoomMode", once you found it, copy the code found in the EntityRenderer file (GH) and paste it after getFOVModifier method, it will be handling the scrolling part.

- Whilst in the same file (in your IDE and the EntityRenderer file (GH)), find the line where is says "f /= 4.0F;" and replace it with "f /= getScrollAmount();"
- Once that's done find the line where it says "Config.zoomMode = false;" and add "scrollTotal = 4;" right after it (this will reset the zoomAmount when you're done 'zooming')

Now the mod will technically work but with one small bug, when using the scroll wheel, it will also scroll in your hotbar, to fix this, there is one more step.

- Head over to net.minecraft.client.Minecraft.java and search for "this.thePlayer.inventory.changeCurrentItem(j);" and replace it with the code found in the Minecraft file (GH) and the bug should be fixed!

Hope you enjoy this small improvement and if you wanna make this into an actual mod "Eric's Mod base thing", it's pretty easy to do and should take around 10-15mins.
