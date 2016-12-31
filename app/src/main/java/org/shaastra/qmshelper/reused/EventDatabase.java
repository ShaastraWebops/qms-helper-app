package org.shaastra.qmshelper.reused;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EventDatabase {
	
	public static final String KEY_ROWID = "_id";
	public static final String KEY_EVENTID = "event_id";
	public static final String KEY_EVENT = "event_name";
	public static final String KEY_TEAM = "is_team";
	
	private static final String DATABASE_NAME = "ListOfEvents";
	private static final String DATABASE_TABLE1 = "eventTable";
	private static final String DATABASE_TABLE2 = "eventTableOld";
	private static final int DATABASE_VERSION = 3;
	
	private Data myData;
	private final Context myContext;
	private static SQLiteDatabase myDatabase;
	
	private static class Data extends SQLiteOpenHelper{

		public Data(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE " + DATABASE_TABLE1 + " (" + KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
					KEY_EVENTID+" TEXT NOT NULL, "+
					KEY_EVENT + " TEXT NOT NULL, "+
					KEY_TEAM + " TEXT NOT NULL);"
					);
			db.execSQL("CREATE TABLE " + DATABASE_TABLE2 + " (" + KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
					KEY_EVENTID+" TEXT NOT NULL, "+
					KEY_EVENT + " TEXT NOT NULL, "+
					KEY_TEAM + " TEXT NOT NULL);"
					);

			ContentValues cvc;

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 0);
			cvc.put(KEY_EVENTID, "1");
			cvc.put(KEY_EVENT, "3D Animation Workshop");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 1);
			cvc.put(KEY_EVENTID, "2");
			cvc.put(KEY_EVENT, "Aero's got Talent");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 2);
			cvc.put(KEY_EVENTID, "3");
			cvc.put(KEY_EVENT, "Agrineers");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv4 = new ContentValues();
			cv4.put(KEY_ROWID, 3);
			cv4.put(KEY_EVENTID, "4");
			cv4.put(KEY_EVENT, "Android App Development Workshop");
			cv4.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv4);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 4);
			cvc.put(KEY_EVENTID, "5");
			cvc.put(KEY_EVENT, "Arduino Programmers Challenge");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 5);
			cvc.put(KEY_EVENTID, "6");
			cvc.put(KEY_EVENT, "Astro Spectroscopy Workshop");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 6);
			cvc.put(KEY_EVENTID, "7");
			cvc.put(KEY_EVENT, "Big Data Challenge");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 7);
			cvc.put(KEY_EVENTID, "8");
			cvc.put(KEY_EVENT, "Bio Informatics");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv2 = new ContentValues();
			cv2.put(KEY_ROWID,8);
			cv2.put(KEY_EVENTID, "9");
			cv2.put(KEY_EVENT, "BlackBox");
			cv2.put(KEY_TEAM, "1");
			db.insert(DATABASE_TABLE1, null, cv2);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 9);
			cvc.put(KEY_EVENTID, "10");
			cvc.put(KEY_EVENT, "Boeing National Aeromodelling");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 10);
			cvc.put(KEY_EVENTID, "11");
			cvc.put(KEY_EVENT, "Brand Wars");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv15 = new ContentValues();
			cv15.put(KEY_ROWID, 11);
			cv15.put(KEY_EVENTID, "12");
			cv15.put(KEY_EVENT, "BugCrush");
			cv15.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv15);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 12);
			cvc.put(KEY_EVENTID, "13");
			cvc.put(KEY_EVENT, "Computer Vision Workshop");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 13);
			cvc.put(KEY_EVENTID, "14");
			cvc.put(KEY_EVENT, "Consigliere");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 14);
			cvc.put(KEY_EVENTID, "15");
			cvc.put(KEY_EVENT, "Eaton IDP");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv3 = new ContentValues();
			cv3.put(KEY_ROWID, 15);
			cv3.put(KEY_EVENTID, "16");
			cv3.put(KEY_EVENT, "Eleckart");
			cv3.put(KEY_TEAM, "1");
			db.insert(DATABASE_TABLE1, null, cv3);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 16);
			cvc.put(KEY_EVENTID, "17");
			cvc.put(KEY_EVENT, "Fire N Ice");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 17);
			cvc.put(KEY_EVENTID, "18");
			cvc.put(KEY_EVENT, "FOSS Workshop");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv5 = new ContentValues();
			cv5.put(KEY_ROWID, 18);
			cv5.put(KEY_EVENTID, "19");
			cv5.put(KEY_EVENT, "Game Development Workshop");
			cv5.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv5);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 19);
			cvc.put(KEY_EVENTID, "20");
			cvc.put(KEY_EVENT, "Graphic Design Workshop");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 20);
			cvc.put(KEY_EVENTID, "21");
			cvc.put(KEY_EVENT, "Hoverrace");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv10 = new ContentValues();
			cv10.put(KEY_ROWID, 21);
			cv10.put(KEY_EVENTID, "22");
			cv10.put(KEY_EVENT, "How Things Work");
			cv10.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv10);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 22);
			cvc.put(KEY_EVENTID, "23");
			cvc.put(KEY_EVENT, "Indian Railways Design Challenge");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 23);
			cvc.put(KEY_EVENTID, "24");
			cvc.put(KEY_EVENT, "JARVIS");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv9 = new ContentValues();
			cv9.put(KEY_ROWID, 24);
			cv9.put(KEY_EVENTID, "25");
			cv9.put(KEY_EVENT, "Junkyard Wars");
			cv9.put(KEY_TEAM, "1");
			db.insert(DATABASE_TABLE1, null, cv9);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 25);
			cvc.put(KEY_EVENTID, "26");
			cvc.put(KEY_EVENT, "Launchfest Hackathon");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 26);
			cvc.put(KEY_EVENTID, "27");
			cvc.put(KEY_EVENT, "Magneto");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 27);
			cvc.put(KEY_EVENTID, "28");
			cvc.put(KEY_EVENT, "Manual Robotics");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 28);
			cvc.put(KEY_EVENTID, "29");
			cvc.put(KEY_EVENT, "Maze Rover");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv14 = new ContentValues();
			cv14.put(KEY_ROWID, 29);
			cv14.put(KEY_EVENTID, "30");
			cv14.put(KEY_EVENT, "Mixel");
			cv14.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv14);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 30);
			cvc.put(KEY_EVENTID, "31");
			cvc.put(KEY_EVENT, "Optimo");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv11 = new ContentValues();
			cv11.put(KEY_ROWID, 31);
			cv11.put(KEY_EVENTID, "32");
			cv11.put(KEY_EVENT, "Puzzle Champ");
			cv11.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv11);

			ContentValues cv12 = new ContentValues();
			cv12.put(KEY_ROWID, 32);
			cv12.put(KEY_EVENTID, "33");
			cv12.put(KEY_EVENT, "Paper Plane");
			cv12.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv12);

			ContentValues cv6 = new ContentValues();
			cv6.put(KEY_ROWID, 33);
			cv6.put(KEY_EVENTID, "34");
			cv6.put(KEY_EVENT, "PCB Design Workshop");
			cv6.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv6);

			ContentValues cv7 = new ContentValues();
			cv7.put(KEY_ROWID, 34);
			cv7.put(KEY_EVENTID, "35");
			cv7.put(KEY_EVENT, "Python Workshop");
			cv7.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv7);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 35);
			cvc.put(KEY_EVENTID, "36");
			cvc.put(KEY_EVENT, "Race car design workshop");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 36);
			cvc.put(KEY_EVENTID, "37");
			cvc.put(KEY_EVENT, "Rapid Chess");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 37);
			cvc.put(KEY_EVENTID, "38");
			cvc.put(KEY_EVENT, "RefAir Workshop");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 38);
			cvc.put(KEY_EVENTID, "39");
			cvc.put(KEY_EVENT, "Research and Innovation Expo");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv16 = new ContentValues();
			cv16.put(KEY_ROWID, 39);
			cv16.put(KEY_EVENTID, "40");
			cv16.put(KEY_EVENT, "Research in 2 Min");
			cv16.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv16);

			ContentValues cv13 = new ContentValues();
			cv13.put(KEY_ROWID, 40);
			cv13.put(KEY_EVENTID, "41");
			cv13.put(KEY_EVENT, "Reverse Coding");
			cv13.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv13);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 41);
			cvc.put(KEY_EVENTID, "42");
			cvc.put(KEY_EVENT, "Robo Oceana");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 42);
			cvc.put(KEY_EVENTID, "43");
			cvc.put(KEY_EVENT, "Robo Wars");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 43);
			cvc.put(KEY_EVENTID, "44");
			cvc.put(KEY_EVENT, "SARC");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 44);
			cvc.put(KEY_EVENTID, "45");
			cvc.put(KEY_EVENT, "Shaastra Cube Open");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 45);
			cvc.put(KEY_EVENTID, "46");
			cvc.put(KEY_EVENT, "Shaastra Circuit Design Challenge");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 46);
			cvc.put(KEY_EVENTID, "47");
			cvc.put(KEY_EVENT, "Shaastra Main Quiz");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 47);
			cvc.put(KEY_EVENTID, "48");
			cvc.put(KEY_EVENT, "Shaastra Programming Contest");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 48);
			cvc.put(KEY_EVENTID, "49");
			cvc.put(KEY_EVENT, "Smart City Challenge");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 49);
			cvc.put(KEY_EVENTID, "50");
			cvc.put(KEY_EVENT, "Solidworks Workshop");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 50);
			cvc.put(KEY_EVENTID, "51");
			cvc.put(KEY_EVENT, "Spark Quiz");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 51);
			cvc.put(KEY_EVENTID, "52");
			cvc.put(KEY_EVENT, "Startup Wars");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv1 = new ContentValues();
			cv1.put(KEY_ROWID,52);
			cv1.put(KEY_EVENTID, "53");
			cv1.put(KEY_EVENT, "SURC");
			cv1.put(KEY_TEAM, "1");
			db.insert(DATABASE_TABLE1, null, cv1);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 53);
			cvc.put(KEY_EVENTID, "54");
			cvc.put(KEY_EVENT, "TCS Research Poster");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 54);
			cvc.put(KEY_EVENTID, "55");
			cvc.put(KEY_EVENT, "Treasure Hunt");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			cvc = new ContentValues();
			cvc.put(KEY_ROWID, 55);
			cvc.put(KEY_EVENTID, "56");
			cvc.put(KEY_EVENT, "Vaayu Shakti");
			cvc.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cvc);

			ContentValues cv8 = new ContentValues();
			cv8.put(KEY_ROWID, 56);
			cv8.put(KEY_EVENTID, "57");
			cv8.put(KEY_EVENT, "Web Development Workshop");
			cv8.put(KEY_TEAM, "0");
			db.insert(DATABASE_TABLE1, null, cv8);
		}
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE1);
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE2);
			onCreate(db);
		}
	}
	public long update(){
		myDatabase.delete(DATABASE_TABLE2, null, null);
		myDatabase.execSQL("INSERT INTO "+DATABASE_TABLE2+" SELECT * FROM "+DATABASE_TABLE1);
		return myDatabase.delete(DATABASE_TABLE1, null, null);
	}
	public EventDatabase(Context c){
		myContext = c;
	}
	public EventDatabase open(){
		myData = new Data(myContext);
		myDatabase = myData.getWritableDatabase();
		return this;
	}
	public long createEntry(String event, String eventid, String isTeam){
		ContentValues cv = new ContentValues();
		cv.put(KEY_EVENT, event);
		cv.put(KEY_EVENTID, eventid);
		cv.put(KEY_TEAM, isTeam);
		return myDatabase.insert(DATABASE_TABLE1, null, cv);
	}
	public String[][] getData(){
		int count=0;
		int i=0;
		String[] columns = new String[]{KEY_ROWID,KEY_EVENTID,KEY_EVENT,KEY_TEAM};
		Cursor c = myDatabase.query(DATABASE_TABLE1, columns, null, null, null, null, null);
		int eventid = c.getColumnIndex(KEY_EVENTID);
		int  event= c.getColumnIndex(KEY_EVENT);
		int team = c.getColumnIndex(KEY_TEAM);
		
		for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			count++;
		}
		String[][] data = new String[3][count];
		for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
				data[0][i] = c.getString(eventid);
				data[1][i] = c.getString(event);
				data[2][i] = c.getString(team);
				i++;
		}
		return data;
	}
	public void close(){
		myData.close();
	}
}
