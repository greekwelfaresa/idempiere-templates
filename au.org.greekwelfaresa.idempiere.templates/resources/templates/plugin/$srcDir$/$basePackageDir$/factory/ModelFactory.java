package $basePackageName$.factory;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.osgi.service.component.annotations.Component;

import $basePackageName$.model.MModelClass;

//Need to make the ranking higher than the default model or else it doesn't get called.
@Component(property = { "service.ranking:Integer=" + ModelFactory.RANKING })
public class ModelFactory implements IModelFactory {

	public static final int RANKING = 100;

	@Override
	public Class<?> getClass(String tableName) {
		switch (tableName) {
		case MModelClass.Table_Name:
			return MModelClass.class;
		}
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		switch (tableName) {
		case MModelClass.Table_Name:
			return new MModelClass(Env.getCtx(), Record_ID, trxName);
		}
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		switch (tableName) {
		case MModelClass.Table_Name:
			return new MModelClass(Env.getCtx(), rs, trxName);
		}
		return null;
	}

}
