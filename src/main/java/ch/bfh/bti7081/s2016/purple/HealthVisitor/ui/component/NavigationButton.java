package ch.bfh.bti7081.s2016.purple.HealthVisitor.ui.component;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;

public class NavigationButton extends Button {

	  /**
	 * 
	 */
	private static final long serialVersionUID = -5965251405523547764L;

	public NavigationButton(String name, String view, FontAwesome icon){
	        super(name);
	        this.setIcon(icon);
	        this.setData(name);
	        this.addClickListener(click -> getUI().getNavigator().navigateTo(view));
	    }
}