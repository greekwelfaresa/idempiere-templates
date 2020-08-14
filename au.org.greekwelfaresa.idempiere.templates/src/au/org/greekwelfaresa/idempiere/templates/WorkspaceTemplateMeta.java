package au.org.greekwelfaresa.idempiere.templates;

import static org.osgi.service.metatype.annotations.AttributeType.PASSWORD;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(id = "au.org.greekwelfaresa.idempiere.templates.postgresql-workspace", name = WorkspaceTemplateMeta.NAME, description = WorkspaceTemplateMeta.NAME)
public @interface WorkspaceTemplateMeta {

	public static final String NAME = "iDempiere PostgreSQL Workspace Template";

	@AttributeDefinition(name = "DB Host", description = "Host on which PostgreSQL is running")
	String dbHost() default "localhost";

	@AttributeDefinition(name = "DB Port", description = "Port on which PostgreSQL is listening")
	int dbPort() default 5432;

	@AttributeDefinition(name = "DB Name", description = "Name of the database instance/schema in which iDempiere is installed")
	String dbName() default "idempiere";

	@AttributeDefinition(name = "DB Username", description = "Username for database connections")
	String dbUser() default "adempiere";

	@AttributeDefinition(name = "DB Password", description = "Password for database connections", type = PASSWORD)
	String dbPassword() default "adempiere";
}
