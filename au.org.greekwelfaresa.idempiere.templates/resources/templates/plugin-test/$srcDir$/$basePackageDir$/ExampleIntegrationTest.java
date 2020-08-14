package $basePackageName$;

import java.time.Instant;

import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.compiere.model.MBPartner;
import org.idempiere.test.assertj.IDSoftAssertions;
import org.idempiere.test.common.annotation.InjectIDempiereEnv;
import org.idempiere.test.common.env.IDempiereEnv;
import org.idempiere.test.junit5.IDempiereEnvExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SoftAssertionsExtension.class)
@ExtendWith(IDempiereEnvExtension.class)
public class ExampleIntegrationTest {

	@InjectIDempiereEnv
	IDempiereEnv env;

	MBPartner bp;

	@BeforeEach
	public void before() {
		bp = env.createBP();
	}

	@Test
	public void save_successfullySaves(IDSoftAssertions softly) {
		softly.assertThat(bp).hasName(ExampleIntegrationTest.class.getName() + ".save_successfullySaves");
		Instant before = Instant.now();
		bp.setName("new name");
		bp.setName2("old name");
		bp.saveEx();
		softly.assertThat(bp)
			.hasName("new name")
			.hasName2("old name")
			.wasUpdatedAfter(before)
			.wasUpdatedBefore(Instant.now());
	}
}