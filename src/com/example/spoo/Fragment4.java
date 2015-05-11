package com.example.spoo;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v4.app.Fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;

import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public class Fragment4 extends Fragment implements View.OnClickListener {
	private Vibrator vibrator;
	LoginFragment loginfragment = new LoginFragment();

	final CharSequence[] itemlist = { "Report an issue", "Suggestions",
			"Become a Partner" };

	// In fragment we can create a separate layout file or java objects that
	// contain the appearance.
	// Button csbutton,lgbutton,dmabutton;
	/*
	 * @Override public Dialog onCreateDialog(Bundle savedInstanceState) {
	 * 
	 * return new AlertDialog.Builder(getActivity())
	 * 
	 * .setTitle("Contact") .setPositiveButton("Yes", new
	 * DialogInterface.OnClickListener() { public void onClick(DialogInterface
	 * dialog, int whichButton) { //
	 * ((FragmentAlertDialog)getActivity()).doPositiveClick(); // calling method
	 * here
	 * 
	 * } } ) .setNegativeButton("No", new DialogInterface.OnClickListener() {
	 * public void onClick(DialogInterface dialog, int whichButton) { //
	 * ((FragmentAlertDialog)getActivity()).doNegativeClick(); } } ) .create();
	 */

	// called when fragment is attached to activity
	@Override
	public void onAttach(Activity activity) {

		super.onAttach(activity);
	}

	// called to do initial creation of the fragment.
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.settings, container, false);

		// Watch for button clicks.
		Button button = (Button) view.findViewById(R.id.csbutton);
		Button logoutButton = (Button) view.findViewById(R.id.lgbutton);
		Button dmaButton = (Button) view.findViewById(R.id.dmabutton);
		CheckBox checkbox = (CheckBox) view.findViewById(R.id.voncheckBox);
		CheckBox checkboxsound = (CheckBox) view.findViewById(R.id.soncheckBox);
		dmaButton.setOnClickListener(this);
		button.setOnClickListener(this);
		logoutButton.setOnClickListener(this);
		// button.setOnClickListener(new OnClickListener() {

		// @Override
		// public void onClick(View v) {
		// TODO Auto-generated method stub

		// }
		// });
		checkbox.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (((CheckBox) v).isChecked()) {
					vibrator = (Vibrator) getActivity().getSystemService(
							Context.VIBRATOR_SERVICE);
					vibrator.vibrate(500); // In ms
				}
			}
		});
		Button vonButton = (Button) view.findViewById(R.id.vonbutton);
		// Button sonButton= (Button) view.findViewById(R.id.sonbutton);
		vonButton.setOnClickListener(this);
		dmaButton.setOnClickListener(this);
		button.setOnClickListener(this);
		logoutButton.setOnClickListener(this);

		return view;

	}

	// Creating this method will help to Modify/Access UI elements.
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {

		super.onStart();
	}

	@Override
	public void onResume() {

		super.onResume();
	}

	@Override
	public void onPause() {

		super.onPause();
	}

	@Override
	public void onStop() {

		super.onStop();
	}

	@Override
	public void onDestroyView() {

		super.onDestroyView();
	}

	@Override
	public void onDestroy() {

		super.onDestroy();
	}

	@Override
	public void onDetach() {

		super.onDetach();
	}

	@Override
	public void onClick(View v) {

		// onCreateDialog(new Bundle());

		switch (v.getId()) {
		case R.id.csbutton:
			new AlertDialog.Builder(v.getContext()).setTitle("Contact Us")
					.setItems(itemlist, new DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which)
						// The 'which' argument contains the index position
						// of the selected item
						{
							// TODO Auto-generated method stub
							switch (which) {

							case 0:
								// reportissue(d);
								Intent intent = null,
								chooser = null;

								// intent = new
								// Intent(Intent.ACTION_SEND_MULTIPLE);
								intent = new Intent(Intent.ACTION_SEND);
								// intent.setType("*/*");
								intent.setData(Uri.parse("mailto:"));
								intent.setType("message/rfc822");
								// For opening an email application
								String[] emailaddress = { "spootr2014@gmail.com" };
								intent.putExtra(Intent.EXTRA_EMAIL,
										emailaddress);
								intent.putExtra(Intent.EXTRA_SUBJECT, "Help");
								intent.putExtra(Intent.EXTRA_TEXT,
										"Android App Version: ");
								intent.putExtra(Intent.EXTRA_TEXT,
										"Write your Android device model:");

								// intent.setType("text/plain");
								chooser = Intent.createChooser(intent,
										"Send Email");
								startActivity(chooser);
								break;
							case 1:
								// suggestion(view);
								// Intent intent = null, chooser = null;
								// if (view.getId()==R.array.contactus)
								intent = new Intent(Intent.ACTION_SENDTO);

								intent.setData(Uri.parse("mailto:"));
								intent.setType("message/rfc822");
								String[] emailaddresssuggestion = { "spootr2014@gmail.com" };
								intent.putExtra(Intent.EXTRA_EMAIL,
										emailaddresssuggestion);
								// intent.getData();
								intent.putExtra(Intent.EXTRA_SUBJECT,
										"Write Your Suggestions");
								// intent.putExtra(Intent.EXTRA_TEXT,
								// "I have some suggestions ");

								// intent.setType("text/plain");
								chooser = Intent.createChooser(intent,
										"Send Email");
								startActivity(chooser);
								break;

							case 2:
								// becomepartner(view);
								// becomepartner(view);

								// if (view.getId()==R.array.contactus)
								intent = new Intent(Intent.ACTION_SEND_MULTIPLE);

								intent.setData(Uri.parse("mailto:"));
								intent.setType("message/rfc822");
								String[] emailaddressbecomepartner = { "spootr2014@gmail.com" };
								intent.putExtra(Intent.EXTRA_EMAIL,
										emailaddressbecomepartner);
								intent.putExtra(Intent.EXTRA_SUBJECT, "Spootr ");
								// intent.putExtra(Intent.EXTRA_TEXT,"Check out Spootr! Spot someone or get spotted ! http://www.spootr.com/app");

								// intent.setType("text/plain");
								chooser = Intent.createChooser(intent,
										"Send Email");
								startActivity(chooser);
								break;
								
							default:
								break;

							}

						}

					}).show();
			break;

		case R.id.lgbutton:
			new AlertDialog.Builder(v.getContext())
					.setTitle("Log Out")
					// .setCancelable(false)
					.setMessage("Are you sure you want to log out?")

					.setNeutralButton("Cancel",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int arg1) {
									// TODO Auto-generated method stub

									dialog.cancel();

								}
							})
					.setPositiveButton("Logout",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									// Intent mainscreen = new
									// Intent("android.intent.action.MAIN");
									// startActivity(mainscreen);
									// Settings.this.finish();
									/*
									 * Toast.makeText(getApplicationContext(),
									 * "Your are successfully logeed out",
									 * Toast.LENGTH_LONG).show();
									 */

									FragmentTransaction transaction = getFragmentManager()
											.beginTransaction();
									transaction.replace(R.id.container,
											loginfragment);

									/*
									 * android.app.FragmentTransaction
									 * transaction =
									 * getFragmentManager().beginTransaction();
									 * transaction.replace(R.id.container,
									 * loginfragment);
									 */
									// transaction.addToBackStack(null);

									// Commit the transaction
									transaction.commit();

									/*
									 * Intent mainActivity = new Intent(
									 * getApplicationContext(),
									 * MainActivity.class);
									 * startActivity(mainActivity);
									 * Settings.this.finish();
									 */
									// Note: Make sure main activity page should
									// come and application should start again
									// (Refer android Life-cycle tutorial)
									// MainActivity main= new MainActivity();
									// main.onStart();

								}

							}).show();
			break;

		case R.id.dmabutton:
			new AlertDialog.Builder(v.getContext())
					.setTitle("Delete Account")
					.setMessage("Are you sure you want to delete?")
					.setNeutralButton("Cancel",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub

									dialog.cancel();

								}
							})
					.setPositiveButton("Delete",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface arg0,
										int which) {
									// TODO Auto-generated method stub
									// MainActivity.this.finish()
									// Note: It should delete the data and come
									// back
									// to activity
									// main xml layout page
									// if user deactivates account and if it
									// again
									// login next time
									// the data should be erased completely

									/*
									 * Toast.makeText(getApplicationContext(),
									 * "Your account has been deactivated",
									 * Toast.LENGTH_LONG).show();
									 * Settings.this.finish(); Intent
									 * mainActivity = new Intent(
									 * getApplicationContext(),
									 * MainActivity.class);
									 * startActivity(mainActivity);
									 */

								}
							}).show();
			break;

		default:
			break;

		}
	}

	// email activity for report an issue
	public void reportissue(View d) {
		Intent intent = null, chooser = null;

		intent = new Intent(Intent.ACTION_SEND_MULTIPLE);
		// intent.setType("*/*");
		intent.setData(Uri.parse("mailto:"));
		intent.setType("message/rfc822");
		// For opening an email application
		String[] emailaddress = { "spootr2014@gmail.com" };
		intent.putExtra(Intent.EXTRA_EMAIL, emailaddress);
		intent.putExtra(Intent.EXTRA_SUBJECT, "Help");
		intent.putExtra(Intent.EXTRA_TEXT, "Android App Version: ");
		intent.putExtra(Intent.EXTRA_TEXT, "Write your Android device model:");

		// intent.setType("text/plain");
		chooser = Intent.createChooser(intent, "Send Email");
		startActivity(chooser);

	}

}
