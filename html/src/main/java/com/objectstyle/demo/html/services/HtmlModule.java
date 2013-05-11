package com.objectstyle.demo.html.services;

import org.apache.tapestry5.ioc.ServiceBinder;

import com.objectstyle.demo.html.services.cayenne.CayenneService;
import com.objectstyle.demo.html.services.cayenne.ICayenneService;
import com.objectstyle.demo.html.services.domain.IDomainService;
import com.objectstyle.demo.html.services.domain.VhostDomainService;

public class HtmlModule {

	public static void bind(ServiceBinder binder) {
		binder.bind(ICayenneService.class, CayenneService.class);
		binder.bind(IDomainService.class, VhostDomainService.class);
	}
}