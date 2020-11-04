/***
*     Paste this after getFOVModifier Method
*/

int scrollTotal = 4;
private int getScrollAmount() {
	if (ModuleManager.getModZoom().isEnabled()) {
		final int i = Mouse.getDWheel();

		if (i != 0)
		{
			if (i > 1)
			{
				scrollTotal++;
			}

			if (i < -1)
			{
				scrollTotal--;
			}
			if (scrollTotal > 16) {
				scrollTotal = 16;
			}
			if (scrollTotal < 1) {
				scrollTotal = 1;
			}
		}
	}
	return scrollTotal;
}
