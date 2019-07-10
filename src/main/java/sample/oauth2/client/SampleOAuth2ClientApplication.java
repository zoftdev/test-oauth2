/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.oauth2.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleOAuth2ClientApplication {

	public static void main(String[] args) {

		System.setProperty("javax.net.ssl.trustStore",
				"/mnt/d/playground/2019/spring-boot-2.1.6.RELEASE/spring-boot-samples/spring-boot-sample-oauth2-client/cacerts.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "123456");
		System.setProperty("javax.net.ssl.keyStore",
				"/mnt/d/playground/2019/spring-boot-2.1.6.RELEASE/spring-boot-samples/spring-boot-sample-oauth2-client/cacerts.jks");
		System.setProperty("javax.net.ssl.keyStorePassword", "123456");
		// System.setProperty("javax.net.ssl.trustStore","D:\\tmp\\sso-dev.cer");
		SpringApplication.run(SampleOAuth2ClientApplication.class);
	}

}
