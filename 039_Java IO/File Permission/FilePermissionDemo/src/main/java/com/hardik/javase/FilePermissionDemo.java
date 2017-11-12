package com.hardik.javase;

import java.io.FilePermission;
import java.security.PermissionCollection;

/**
 * File Permission Class
 * 
 * Java FilePermission class contains the permission related to a directory or
 * file. All the permissions are related with path. The path can be of two
 * types:
 * 
 * 1) D:\\IO\\-: It indicates that the permission is associated with all sub
 * directories and files recursively.
 * 
 * 2) D:\\IO\\*: It indicates that the permission is associated with all
 * directory and files within this directory excluding sub directories.
 * 
 * https://www.javatpoint.com/java-filepermission-class
 * 
 * @author HARDIK HIRAPARA
 */
public class FilePermissionDemo {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String filePath = "E:\\Hardik\\temp\\abc.txt";

		FilePermission filePermission1 = new FilePermission(filePath, "read");
		PermissionCollection permission = filePermission1.newPermissionCollection();

		permission.add(filePermission1);

		FilePermission filePermission2 = new FilePermission(filePath, "write");
		permission.add(filePermission2);

		if (permission.implies(new FilePermission(filePath, "read,write"))) {
			System.out.println("Read, Write permission is granted for the path " + filePath);
		} else {
			System.out.println("No Read, Write permission is granted for the path " + filePath);
		}
	}
}
