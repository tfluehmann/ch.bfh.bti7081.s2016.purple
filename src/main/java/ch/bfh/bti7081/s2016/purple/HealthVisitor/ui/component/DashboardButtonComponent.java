package ch.bfh.bti7081.s2016.purple.HealthVisitor.ui.component;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;

public class DashboardButtonComponent extends Button {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8678413838884982463L;

	public DashboardButtonComponent(String text, FontAwesome icon){
		this.setCaption(text);
		this.setIcon(icon);
		this.setWidth("200px");
		this.setHeight("200px");
        this.setStyleName("v-button-icon-align-top");
	}
	
	
}
