package control.lifx.Messages.Device;

import control.lifx.DataTypes.Payload;

public class GetPower_Device extends Payload {
	int code = 20;
	
	public GetPower_Device() {}
	
	public int getCode() {
		return code;
	}
}