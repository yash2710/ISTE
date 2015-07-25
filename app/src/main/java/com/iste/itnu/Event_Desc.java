package com.iste.itnu;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Event_Desc extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventdesc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView i = (ImageView) findViewById(R.id.imageevent);
        TextView t = (TextView) findViewById(R.id.textevent);
//        TextView t1 = (TextView) findViewById(R.id.textevent1);

        Bundle ext = getIntent().getExtras();
        int val = 0;
        if (ext != null) {
            val = ext.getInt("a");
        }
        if (val == 0) {
            setTitle("CineFreaks");
            i.setImageResource(R.drawable.b11);
            t.setText("The most enthralling media quiz-Cinefreaks was organized by ISTE on Foundation Day and was a real fun-filled music and movies quizzing fiesta. The first round was an objective questions paper-based round and the best six teams (of three members each) were chosen based on most correct answers for the Finals. The Finals had rounds including identifying movies from clips shown, recognizing tracks being played (both foreign and Indian bands), and distinguishing movie stars and movie dialogues. It was a closely contested fight with participants throwing in all their music and movies gyaan to win the Quiz. The winners were awarded cash prizes and participation certificates to all finalists of the event.");
        } else if (val == 1) {
            setTitle("Freshers Frenzy");
            i.setImageResource(R.drawable.b22);
            t.setText("ISTE planned a series of events under Fresher's Frenzy in order to welcome the first year students and make them feel at home. Frenzy was aimed to give them a glimpse of everything ranging from technical arena, cultural fun, a platform to showcase their talent as well as an opportunity to interact with people from different branches. In short, a scoop of everything they could drool at with event like:" +
                    "\nSerendipity\nIQ Champs\nMinute to win it\nMicro Football\nand also technical workshop as well along with a talent show for the juniors to showcase their skills.");
        } else if (val == 2) {
            setTitle("Incendio - The Power Of FOUR");
            i.setImageResource(R.drawable.b44);
            t.setText("All the enthusiastic T.V. geeks, quizzers, debaters and the budding witty " +
                    "heads were beckoned to test their mettle at the fun filled extravaganza of " +
                    "INCENDIO, organised solely by first years.\n" +
                    "\n" +
                    "1. IDIOT BOX\n" +
                    "\n" +
                    "Participants ticking their brains to stand as the biggest fan of the famous " +
                    "four TV-series FRIENDS, GAME OF THRONES, THE BIG BANG THEORY and " +
                    "SHERLOCK , that was what IDIOT BOX did!!\n" +
                    "\n" +
                    "2. CONNECTIFY\n" +
                    "\n" +
                    "The event witnessed, participants scratching their head, in order to " +
                    "connect the clues.\n" +
                    "\n" +
                    "3. SUPERFAST EXPRESS\n" +
                    "\n" +
                    "It was battle of wits in this fast paced competition, 'SUPERFAST EXPRESS' .\n" +
                    "\n" +
                    "4. BLUFFMASTER\n" +
                    "\n" +
                    "Bluffing other participants, is what the master does here!");
        } else if (val == 3) {
            setTitle("Lecture Series");
            i.setImageResource(R.drawable.b55);
            t.setText("A free lecture series by Prof. Dhaval Pujara was conducted by ISTE which incorporated the knowledge and wisdom of various topics related to the development of the soft skills of the students." +
                    "\nThe lecture series had interesting topics as follows:\n1)Learning through Games\n2)Art of Effective Presentation\n3)Critical Thinking\n4)Time Management\n5)Positive attitude in Life\nNeedless to say that each lecture of the series was a crucial lesson to the students and holds incredible importance in our everyday lives.");
        } else if (val == 4){
            setTitle("Koshish");
            i.setImageResource(R.drawable.b66);
            t.setText("Koshish is a part of ISTE’s yearly plan to give back to the society with the" +
                    "idea of spreading light towards a brighter a INDIA. ISTE organised an inter " +
                    "college competition for the  enthusiastic students who were given various " +
                    "tasks related to social amendments our society is deprived of.\n" +
                    "ISTE in association with YUVA Unstoppable paid a visit to orphanage where ISTIANS did " +
                    "a small task of spreading smiles. The spirit with which ISTE works towards " +
                    "lending a helping hand towards our society lies within the thought " +
                    "\"Materialistic thing can still fade away but the smile donated remains " +
                    "etched to the heart for lifelong with the one who gets it and with the one " +
                    "who was the cause of the smile worth millions.\"");
        }
        Typeface tf = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        t.setTypeface(tf);
    }
}