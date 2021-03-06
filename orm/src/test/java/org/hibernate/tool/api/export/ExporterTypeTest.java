package org.hibernate.tool.api.export;

import org.junit.Assert;
import org.junit.Test;


public class ExporterTypeTest {
	
	@Test
	public void testExporterType() {
		Assert.assertEquals(
				"org.hibernate.tool.internal.export.java.JavaExporter",
				ExporterType.JAVA.className());
		Assert.assertEquals(
				"org.hibernate.tool.internal.export.cfg.CfgExporter", 
				ExporterType.CFG.className());
	}

}
