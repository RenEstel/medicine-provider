package io.githab.renestel.medicine.provider.app;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MedicineProviderAppication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(MedicineProviderAppication.class)
		  .bannerMode(Banner.Mode.OFF)
		  .logStartupInfo(false)
		  .registerShutdownHook(true)
		  .run();
	}
}
