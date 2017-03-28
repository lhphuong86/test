/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.walle.le.test_jaxb;

import javax.xml.bind.JAXBException;

/**
 *
 * @author lhphuong86
 */
public class Main {

	public static void main(String[] args) throws JAXBException {
		RequestXML requestXML = new RequestXML();
		requestXML.setFullName("le hoai phuong");
		requestXML.setVcbID("50401938");
		System.out.println("XML string" + Utils.convertToXml(requestXML));

		System.out.println("Object string" + Utils.convertToObject(Utils.convertToXml(requestXML),requestXML));

	}
}
