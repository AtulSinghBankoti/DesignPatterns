package design.pattern.builder;

public class GenericVechile {
	
	private final String vechileName;
	private final String transmissionType ;
	private final Long noOfCylinder;
	private final Boolean turbo;
	private final Long noOfAirbags;
	private final Boolean crashSensor;
	private final Boolean touchScreen;
	private final Long touchScreenSize;
	private final Boolean view360Camera;
	private final Boolean rearCamera;
	private final Long topSpeed;
	private final Boolean cruiseControl;
	
	public GenericVechile(GenericVechileBuilder vechileBuilder) {
		this.vechileName = vechileBuilder.vechileName;
		this.transmissionType = vechileBuilder.transmissionType;
		this.noOfCylinder = vechileBuilder.noOfCylinder;
		this.turbo = vechileBuilder.turbo;
		this.noOfAirbags = vechileBuilder.noOfAirbags;
		this.crashSensor = vechileBuilder.crashSensor;
		this.touchScreen = vechileBuilder.touchScreen;
		this.touchScreenSize = vechileBuilder.touchScreenSize;
		this.view360Camera = vechileBuilder.view360Camera;
		this.rearCamera = vechileBuilder.rearCamera;
		this.topSpeed = vechileBuilder.topSpeed;
		this.cruiseControl = vechileBuilder.cruiseControl;
	}
	
	

	public String getVechileName() {
		return vechileName;
	}



	public String getTransmissionType() {
		return transmissionType;
	}

	public Long getNoOfCylinder() {
		return noOfCylinder;
	}

	public Boolean getTurbo() {
		return turbo;
	}

	public Long getNoOfAirbags() {
		return noOfAirbags;
	}

	public Boolean getCrashSensor() {
		return crashSensor;
	}

	public Boolean getTouchScreen() {
		return touchScreen;
	}

	public Long getTouchScreenSize() {
		return touchScreenSize;
	}

	public Boolean getView360Camera() {
		return view360Camera;
	}

	public Boolean getRearCamera() {
		return rearCamera;
	}

	public Long getTopSpeed() {
		return topSpeed;
	}

	public Boolean getCruiseControl() {
		return cruiseControl;
	}
	
	
	
	
	@Override
	public String toString() {
		return "GenericVechile [vechileName=" + vechileName + ", transmissionType=" + transmissionType
				+ ", noOfCylinder=" + noOfCylinder + ", turbo=" + turbo + ", noOfAirbags=" + noOfAirbags
				+ ", crashSensor=" + crashSensor + ", touchScreen=" + touchScreen + ", touchScreenSize="
				+ touchScreenSize + ", view360Camera=" + view360Camera + ", rearCamera=" + rearCamera + ", topSpeed="
				+ topSpeed + ", cruiseControl=" + cruiseControl + "]";
	}




	static class GenericVechileBuilder {
		
		private final String vechileName;
		private final String transmissionType ;
		private final Long noOfCylinder;
		private  final Long topSpeed;
		private final Long noOfAirbags;
		private Boolean turbo;
		private  Boolean crashSensor;
		private  Boolean touchScreen;
		private  Long touchScreenSize;
		private  Boolean view360Camera;
		private  Boolean rearCamera;
		private  Boolean cruiseControl;
		
		public GenericVechileBuilder(String vechileName, String transmissionType, Long noOfCylinder, Long topSpeed,
				Long noOfAirbags) {
			super();
			this.vechileName = vechileName;
			this.transmissionType = transmissionType;
			this.noOfCylinder = noOfCylinder;
			this.topSpeed = topSpeed;
			this.noOfAirbags = noOfAirbags;
		}

		public GenericVechileBuilder setTurbo(Boolean turbo) {
			this.turbo = turbo;
			return this;
		}

		public GenericVechileBuilder setCrashSensor(Boolean crashSensor) {
			this.crashSensor = crashSensor;
			return this;
		}

		public GenericVechileBuilder setTouchScreen(Boolean touchScreen) {
			this.touchScreen = touchScreen;
			return this;
		}

		public GenericVechileBuilder setTouchScreenSize(Long touchScreenSize) {
			this.touchScreenSize = touchScreenSize;
			return this;
		}

		public GenericVechileBuilder setView360Camera(Boolean view360Camera) {
			this.view360Camera = view360Camera;
			return this;
		}

		public GenericVechileBuilder setRearCamera(Boolean rearCamera) {
			this.rearCamera = rearCamera;
			return this;
		}

		public GenericVechileBuilder setCruiseControl(Boolean cruiseControl) {
			this.cruiseControl = cruiseControl;
			return this;
		}
		
		
		GenericVechile build() {
			GenericVechile vechile = new GenericVechile(this);
			return vechile;
		}
		
	
	}
	
		
}
