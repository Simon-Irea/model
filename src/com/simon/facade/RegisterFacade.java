package com.simon.facade;
/**
 * ����ע�ṫ˾���̵���۶���
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
