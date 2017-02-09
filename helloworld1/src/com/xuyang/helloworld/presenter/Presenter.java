package com.xuyang.helloworld.presenter;

import com.xuyang.helloworld.model.IModel;
import com.xuyang.helloworld.model.Model;
import com.xuyang.helloworld.view.IView;

public class Presenter implements IPresenter{
	private IModel model;
	private IView view;
	private String str;
	
	public Presenter(IView view) {
		this.model = new Model();
		this.view = view;
	}

	@Override
	public void getString() {
		str = model.loadString();
		view.show(str);
	}
	
	
}
