#include "VonKoch.h"

void SnowFlakeView::onDraw(CDC *pDC) {
	CSnowflake Doc * pDoc = GEetDocument();
	ASEERT_VALID(pDC);
	if(!pDC)
		return;
		
	// TODO: add draw code for native data here
	
	VonKoch(200, 4, pDC).snowflake();
}
