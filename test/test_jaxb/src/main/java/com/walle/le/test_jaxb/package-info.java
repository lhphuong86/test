/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@XmlSchema(
    namespace="www.google.com",
    elementFormDefault = XmlNsForm.QUALIFIED,
    xmlns={
        @XmlNs(namespaceURI = "www.google.com", prefix = ""),
        @XmlNs(namespaceURI = "www.google.com", prefix = "myName"),
    })
package com.walle.le.test_jaxb;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;

