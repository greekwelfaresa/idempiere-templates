package $basePackageName$.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * You would put any model customisation logic into this class rather than into
 * the auto-generated X_ModelClass (which will be overwritten).
 */
public class MModelClass extends X_ModelClass {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Standard Constructor */
	public MModelClass(Properties ctx, int ModelClass_ID, String trxName) {
		super(ctx, ModelClass_ID, trxName);
	}

	/** Load Constructor */
	public MModelClass(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}
