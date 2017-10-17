/**
 * 
 */
package com.zhazhapan.qiniu;

import org.junit.Test;

import com.zhazhapan.qiniu.util.Formatter;

/**
 * @author pantao
 *
 */
public class TestFormatter {

	@Test
	public void testSizeToLong() {
		String[] sizes = { "23.12 MB", "12.89 KB", "23 B", "23.77 GB", "89.12 TB" };
		for (String size : sizes) {
			System.out.println(Formatter.sizeToLong(size));
		}
	}
}
