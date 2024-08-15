package com.wiremock.runner;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

public class WireMockStandalone {
	public static void main(String[] args) {
		WireMockConfiguration config = WireMockConfiguration.wireMockConfig().port(8280) 
				.usingFilesUnderDirectory("src/main/resources/wiremock");

		WireMockServer wireMockServer = new WireMockServer(config);
		wireMockServer.start();

		System.out.println("WireMock server started on port 8280");
	}
}