package com.simon.facade;
/**
 * 办理注册公司流程的外观对象
 * @author Administrator
 *
 */
public class RegisterFacade {
	public void register() {
		Bank bank = new BeijingBank();
		bank.openAccount();
		AIC aic = new BeijingAIC();
		aic.checkName();
	}
}
