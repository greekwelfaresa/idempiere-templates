/** Generated Model - DO NOT CHANGE */
package $basePackageName$.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.I_Persistent;
import org.compiere.model.PO;
import org.compiere.model.POInfo;

/**
 * Example generated Model for ModelClass. Usually you will use the iDempiere
 * model generator to generate these classes for you.
 */
public class X_ModelClass extends PO implements I_ModelClass, I_Persistent {

	/**
	 *
	 */
	private static final long serialVersionUID = 20190926L;

	/** Standard Constructor */
	public X_ModelClass(Properties ctx, int ModelClass_ID, String trxName) {
		super(ctx, ModelClass_ID, trxName);
	}

	/** Load Constructor */
	public X_ModelClass(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	/**
	 * AccessLevel
	 * 
	 * @return 3 - Client - Org
	 */
	@Override
	protected int get_AccessLevel() {
		return accessLevel.intValue();
	}

	/** Load Meta Data */
	@Override
	protected POInfo initPO(Properties ctx) {
		POInfo poi = POInfo.getPOInfo(ctx, Table_ID, get_TrxName());
		return poi;
	}

	/**
	 * Set User/Contact.
	 * 
	 * @param AD_User_ID User within the system - Internal or Business Partner
	 *                   Contact
	 */
	@Override
	public void setAD_User_ID(int AD_User_ID) {
		if (AD_User_ID < 1)
			set_ValueNoCheck(COLUMNNAME_AD_User_ID, null);
		else
			set_ValueNoCheck(COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/**
	 * Get User/Contact.
	 * 
	 * @return User within the system - Internal or Business Partner Contact
	 */
	@Override
	public int getAD_User_ID() {
		Integer ii = (Integer) get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			return 0;
		return ii.intValue();
	}

	/**
	 * Set ModelClass.
	 * 
	 * @param ModelClass_ID ModelClass
	 */
	@Override
	public void setModelClass_ID(int ModelClass_ID) {
		if (ModelClass_ID < 1)
			set_ValueNoCheck(COLUMNNAME_ModelClass_ID, null);
		else
			set_ValueNoCheck(COLUMNNAME_ModelClass_ID, Integer.valueOf(ModelClass_ID));
	}

	/**
	 * Get ModelClass.
	 * 
	 * @return ModelClass
	 */
	@Override
	public int getModelClass_ID() {
		Integer ii = (Integer) get_Value(COLUMNNAME_ModelClass_ID);
		if (ii == null)
			return 0;
		return ii.intValue();
	}

	/**
	 * Set ModelClass_UU.
	 * 
	 * @param ModelClass_UU ModelClass_UU
	 */
	@Override
	public void setModelClass_UU(String ModelClass_UU) {
		set_ValueNoCheck(COLUMNNAME_ModelClass_UU, ModelClass_UU);
	}

	/**
	 * Get ModelClass_UU.
	 * 
	 * @return ModelClass_UU
	 */
	@Override
	public String getModelClass_UU() {
		return (String) get_Value(COLUMNNAME_ModelClass_UU);
	}

}