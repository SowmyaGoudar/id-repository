package io.mosip.credential.minio.cleanup.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import io.mosip.kernel.dataaccess.hibernate.config.HibernateDaoConfig;


@SpringBootApplication(exclude = HibernateDaoConfig.class)
@Import(value = { java.lang.String.class })
@ComponentScan(basePackages = { "io.mosip.*", "${mosip.auth.adapter.impl.basepackage}" }, excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = { "io.mosip.kernel.zkcryptoservice.*",
				"io.mosip.kernel.tokenidgenerator.*", "io.mosip.kernel.signature.*",
				"io.mosip.kernel.partnercertservice.*", "io.mosip.kernel.lkeymanager.*",
				"io.mosip.kernel.keymanagerservice.*", "io.mosip.kernel.keymanager.*", "io.mosip.kernel.keygenerator.*",
				"io.mosip.kernel.cryptomanager.*", "io.mosip.kernel.crypto.*", "io.mosip.kernel.clientcrypto.*",
				"io.mosip.commons.khazana.impl.PosixAdapter", "io.mosip.commons.khazana.util.*",
				"io.mosip.idrepository.core.config.IdRepoDataSourceConfig.*",
				"io.mosip.kernel.dataaccess.hibernate.config.*" }) })
@EnableScheduling
public class CredentialMinioCleanupApp {

	
	public static void main(String[] args) {
		SpringApplication.run(CredentialMinioCleanupApp.class, args);
	}
}
