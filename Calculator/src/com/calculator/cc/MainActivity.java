package com.calculator.cc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btn3_7;
	private EditText edt1_show;
	private Button backspace_btn1;
	private Button ce_btn2;
	private Button btn4_8;
	private Button btn5_9;
	private Button btn6_chu;
	private Button btn7_4;
	private Button btn8_5;
	private Button btn9_6;
	private Button btn10_xing;
	private Button btn11_1;
	private Button btn12_2;
	private Button btn13_3;
	private Button btn14_jia;
	private Button btn15_0;
	private Button btn16_c;
	private Button btn17_deng;
	private Button btn18_jian;
	// ��һ����յı��
	boolean flag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//ȥ��״̬��
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//ʹ��Ļȫ��
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		edt1_show = (EditText) findViewById(R.id.edt1_show);
		backspace_btn1 = (Button) findViewById(R.id.backspace_btn1);
		ce_btn2 = (Button) findViewById(R.id.ce_btn2);
		btn3_7 = (Button) findViewById(R.id.btn3_7);
		btn4_8 = (Button) findViewById(R.id.btn4_8);
		btn5_9 = (Button) findViewById(R.id.btn5_9);
		btn6_chu = (Button) findViewById(R.id.btn6_chu);
		btn7_4 = (Button) findViewById(R.id.btn7_4);
		btn8_5 = (Button) findViewById(R.id.btn8_5);
		btn9_6 = (Button) findViewById(R.id.btn9_6);
		btn10_xing = (Button) findViewById(R.id.btn10_xing);
		btn11_1 = (Button) findViewById(R.id.btn11_1);
		btn12_2 = (Button) findViewById(R.id.btn12_2);
		btn13_3 = (Button) findViewById(R.id.btn13_3);
		btn14_jia = (Button) findViewById(R.id.btn14_jia);
		btn15_0 = (Button) findViewById(R.id.btn15_0);
		btn16_c = (Button) findViewById(R.id.btn16_c);
		btn17_deng = (Button) findViewById(R.id.btn17_deng);
		btn18_jian = (Button) findViewById(R.id.btn18_jian);
		// д�����¼�
		// һ��ɾһ��
		backspace_btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (edt1_show.getText().toString() == null
						|| (edt1_show.getText().toString()).equals("")) {
					return;
				} else {
					edt1_show.setText((edt1_show.getText().toString()).substring(
							0, (edt1_show.getText().toString()).length() - 1));
				}
			}
		});
		// ȫ�����
		ce_btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				edt1_show.setText("");
				flag = false;
			}
		});
		btn3_7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String seven = edt1_show.getText().toString() + 7;
				edt1_show.setText(seven);
			}

		});
		btn4_8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String eight = edt1_show.getText().toString() + 8;
				edt1_show.setText(eight);
			}
		});
		btn5_9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String nine = edt1_show.getText().toString() + 9;
				edt1_show.setText(nine);
			}
		});
		btn6_chu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (flag) {
					fourOperation();
					String chu = edt1_show.getText().toString();
					edt1_show.setText(chu.substring(0, chu.length() - 1) + " "
							+ "/" + " ");
				} else {
					String chu = edt1_show.getText().toString() + " " + "/"
							+ " ";
					edt1_show.setText(chu);
					flag = true;
				}

			}
		});
		btn7_4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String four = edt1_show.getText().toString() + 4;
				edt1_show.setText(four);
			}
		});
		btn8_5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String five = edt1_show.getText().toString() + 5;

				edt1_show.setText(five);
			}
		});
		btn9_6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String six = edt1_show.getText().toString() + 6;

				edt1_show.setText(six);
			}
		});
		btn10_xing.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (flag) {
					fourOperation();
					String xing = edt1_show.getText().toString();
					edt1_show.setText(xing.substring(0, xing.length() - 1)
							+ " " + "*" + " ");
				} else {
					String xing = edt1_show.getText().toString() + " " + "*"
							+ " ";
					edt1_show.setText(xing);
					flag = true;
				}

			}
		});
		btn11_1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String one = edt1_show.getText().toString() + 1;

				edt1_show.setText(one);
			}
		});
		btn12_2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String two = edt1_show.getText().toString() + 2;
				edt1_show.setText(two);
			}
		});
		btn13_3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String three = edt1_show.getText().toString() + 3;
				edt1_show.setText(three);
			}
		});
		btn14_jia.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (flag) {
					fourOperation();
					String jia = edt1_show.getText().toString();
					edt1_show.setText(jia.substring(0, jia.length() - 1) + " "
							+ "+" + " ");
				} else {
					String jia = edt1_show.getText().toString() + " " + "+"
							+ " ";
					edt1_show.setText(jia);
					flag = true;
				}

			}
		});
		btn15_0.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				String zero = edt1_show.getText().toString() + 0;

				edt1_show.setText(zero);
			}
		});
		btn16_c.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String c = edt1_show.getText().toString() + ".";
				edt1_show.setText(c);
			}
		});
		btn17_deng.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				getResult();
			}
		});
		btn18_jian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (flag) {
					fourOperation();
					String jian = edt1_show.getText().toString();
					edt1_show.setText(jian.substring(0, jian.length() - 1)
							+ " " + "-" + " ");
				} else {
					String jian = edt1_show.getText().toString() + " " + "-"
							+ " ";
					edt1_show.setText(jian);
					flag = true;
				}

			}
		});
	}

	// д�Ⱥŵķ���
	private void getResult() {
		String deng = edt1_show.getText().toString();
		// �жϵ����Ⱥ�ʱ�༭��������Ƿ�Ϊ��
		if (deng == null || deng.equals("")) {
			return;
		}
		if (!deng.contains(" ")) {
			return;
		}
		double result = 0;
		// ��ȡ�Ӻ����ߵ��ַ�����üӺ�
		String s1 = deng.substring(0, deng.indexOf(" "));// �����ǰ����ַ�
		String op = deng
				.substring(deng.indexOf(" ") + 1, deng.indexOf(" ") + 2);
		String s2 = deng.substring(deng.indexOf(" ") + 3);
		// s1��s2��Ϊ�յ�����½����ж�����
		if (!s1.equals("") && !s2.equals("")) {
			double d1 = Double.parseDouble(s1);
			double d2 = Double.parseDouble(s2);
			if (op.equals("+")) {
				result = d1 + d2;
			} else if (op.equals("-")) {
				result = d1 - d2;
			} else if (op.equals("*")) {
				result = d1 * d2;
			} else if (op.equals("/")) {
				if (d2 == 0) {
					result = 0;
				} else {
					result = d1 / d2;
				}
			}
			// �ж�s1��s2���Ƿ���С����
			if (!s1.contains(".") && !s2.contains(".")) {
				int r = (int) result;
				if (op.equals("/")) {
					edt1_show.setText(result + "");
				} else {
					edt1_show.setText(r + "");
				}

			} else {
				edt1_show.setText(result + "");
			}
			// �����ж��Ƿ�Ϊһ����ʱ����Ⱥź�Ϊ0ʱ�����
		} else if (!s1.equals("") && s2.equals("")) {

			edt1_show.setText(edt1_show.getText().toString());
		} else if (s1.equals("") && !s2.equals("")) {
			double d2 = Double.parseDouble(s2);
			if (op.equals("+")) {
				result = 0 + d2;
			} else if (op.equals("-")) {
				result = 0 - d2;
			} else if (op.equals("*")) {
				result = 0;
			} else if (op.equals("/")) {
				result = 0;
			}
			if (!s1.contains(".") && !s2.contains(".")) {
				int r = (int) result;
				edt1_show.setText(r + "");
			} else {
				edt1_show.setText(result + "");
			}
		} else {
			edt1_show.setText(" ");
		}
	}

	// дһ���Ӽ��˳��ķ���
	private void fourOperation() {
		String deng = edt1_show.getText().toString();
		// �жϵ����Ⱥ�ʱ�༭��������Ƿ�Ϊ��
		if (deng == null || deng.equals("")) {
			return;
		}
		if (!deng.contains(" ")) {
			return;
		}
		double result = 0;
		// ��ȡ�Ӻ����ߵ��ַ�����üӺ�
		String s1 = deng.substring(0, deng.indexOf(" "));// �����ǰ����ַ�
		String op = deng
				.substring(deng.indexOf(" ") + 1, deng.indexOf(" ") + 2);
		String s2 = deng.substring(deng.indexOf(" ") + 3);

		// s1��s2��Ϊ�յ�����½����ж�����
		if (!s1.equals("") && !s2.equals("")) {
			double d1 = Double.parseDouble(s1);
			double d2 = Double.parseDouble(s2);
			if (op.equals("+")) {
				result = d1 + d2;
			} else if (op.equals("-")) {
				result = d1 - d2;
			} else if (op.equals("*")) {
				result = d1 * d2;
			} else if (op.equals("/")) {
				if (d2 == 0) {
					result = 0;
				} else {
					result = d1 / d2;
				}
			}
			// �ж�s1��s2���Ƿ���С����
			if (!s1.contains(".") && !s2.contains(".")) {
				int r = (int) result;
				if (op.equals("/")) {
					edt1_show.setText(result + " ");
				} else {
					if (op.equals("+")) {
						edt1_show.setText(r + " ");
					} else if (op.equals("-")) {
						edt1_show.setText(r + " ");
					} else if (op.equals("*")) {
						edt1_show.setText(r + " ");
					} else {
						edt1_show.setText(r + " ");
					}
				}

			} else {
				if (op.equals("+")) {
					edt1_show.setText(result + " ");
				} else if (op.equals("-")) {
					edt1_show.setText(result + " ");
				} else if (op.equals("*")) {
					edt1_show.setText(result + " ");
				} else {
					edt1_show.setText(result + " ");
				}
			}
			// �ж�ʽ�����ұ��Ƿ�Ϊ��
		} else if (!s1.equals("") && s2.equals("")) {
			if (op.equals("+")) {
				edt1_show.setText(result + " ");
			} else if (op.equals("-")) {
				edt1_show.setText(result + " ");
			} else if (op.equals("*")) {
				edt1_show.setText(result + " ");
			} else {
				edt1_show.setText(result + " ");
			}
		}
	}
}
