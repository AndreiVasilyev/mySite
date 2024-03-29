package by.bobruisk.homework.model.ajax;

import com.fasterxml.jackson.annotation.JsonView;

public class PrinterCountAjaxResponseBody {

	@JsonView
	private Long printerCount;
	@JsonView
	private String errorMessage;

	public Long getPrinterCount() {
		return printerCount;
	}

	public void setPrinterCount(Long printerCount) {
		this.printerCount = printerCount;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((errorMessage == null) ? 0 : errorMessage.hashCode());
		result = prime * result + ((printerCount == null) ? 0 : printerCount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrinterCountAjaxResponseBody other = (PrinterCountAjaxResponseBody) obj;
		if (errorMessage == null) {
			if (other.errorMessage != null)
				return false;
		} else if (!errorMessage.equals(other.errorMessage))
			return false;
		if (printerCount == null) {
			if (other.printerCount != null)
				return false;
		} else if (!printerCount.equals(other.printerCount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrinterCountResponseBody [printerCount=" + printerCount + ", errorMessage=" + errorMessage + "]";
	}

}
