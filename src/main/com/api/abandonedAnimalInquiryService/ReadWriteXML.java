package main.com.api.abandonedAnimalInquiryService;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ReadWriteXML {
	BufferedWriter bs = null;

	public ReadWriteXML(BufferedWriter bs) {
		super();
		this.bs = bs;
	}

	private void close() {
		try {
			if (bs != null)
				bs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 정상 작동 = true, 오류 발생 = false
	public boolean writeXML(StringBuilder sb) {
		try {
			bs = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("docs/xml/abandonedAnimalInquiryService.xml"), "UTF-8"));
			String str = sb.toString();
			bs.write(str); // Byte형으로만 넣을 수 있음
			return true;
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			close();
		}
		return false;
	}
}
