package au.org.greekwelfaresa.idempiere.templates;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(id = "au.org.greekwelfaresa.idempiere.templates.plugin-test", name = ProjectUnderTestMeta.NAME, description = ProjectUnderTestMeta.NAME)
public @interface ProjectUnderTestMeta {

	public static final String NAME = "iDempiere Integration Test Template";

	@AttributeDefinition(name = "Project Under Test", description = "The name of the project that this integration test is targeting")
	String projectUnderTest();
}
