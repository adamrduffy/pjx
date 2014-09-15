package com.etymon.pj.object.pagemark;

import java.io.*;

/**
   Compatibility operator: EX.
   @author Nassib Nassar
*/
public class XEX
	extends PageMarkOperator {

	public XEX() {
	}

	public long writePdf(OutputStream os) throws IOException {
		return writeln(os, "EX");
	}
	
	/**
	   Returns a deep copy of this object.
	   @return a deep copy of this object.
	*/
	public Object clone() {
		return this;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return (obj instanceof XEX);
	}

}
