package com.teja.SpringMayAnno;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {


	public void process() {
		System.out.println("2nd Best Processor");

	}

}
