/*
 * $Id: SOAP12NamespaceConstants.java,v 1.2 2006-04-13 01:32:26 ofung Exp $
 */

/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License).  You may not use this file except in
 * compliance with the License.
 * 
 * You can obtain a copy of the license at
 * https://glassfish.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at https://glassfish.dev.java.net/public/CDDLv1.0.html.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * you own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Copyright 2006 Sun Microsystems Inc. All Rights Reserved
 */

package com.sun.xml.rpc.soap.streaming;

/**
 * @author JAX-RPC Development Team
 */
public class SOAP12NamespaceConstants {
	public static final String ENVELOPE =
		"http://www.w3.org/2002/06/soap-envelope";
	public static final String ENCODING =
		"http://www.w3.org/2002/06/soap-encoding";
	public static final String SOAP_RPC = "http://www.w3.org/2002/06/soap-rpc";
	public static final String XSD = "http://www.w3.org/2001/XMLSchema";
	public static final String XSI =
		"http://www.w3.org/2001/XMLSchema-instance";
	public static final String TRANSPORT_HTTP =
		"http://www.w3.org/2002/06/soap/bindings/HTTP/";
	public static final String ACTOR_NEXT =
		"http://www.w3.org/2002/06/soap-envelope/role/next";
	public static final String SOAP_UPGRADE =
		"http://www.w3.org/2002/06/soap-upgrade";

	public static final String TAG_ENVELOPE = "Envelope";
	public static final String TAG_HEADER = "Header";
	public static final String TAG_BODY = "Body";
	public static final String TAG_RESULT = "result";

	public static final String ATTR_ACTOR = "role";
	public static final String ATTR_MUST_UNDERSTAND = "mustUnderstand";
	public static final String ATTR_MISUNDERSTOOD = "missUnderstood";
	public static final String ATTR_ENCODING_STYLE = "encodingStyle";
}