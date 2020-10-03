package th.ac.su.cp.quizgame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.cp.quizgame.model.Worditem;

public class WordListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);
        //สร้าง Adapter object
        MyAdapter adapter = new MyAdapter();
        //สร้าง Layout manager
        LinearLayoutManager lm = new LinearLayoutManager(WordListActivity.this);
        // เข้าถึง RecyclerView ในlayout
        RecyclerView rv = findViewById(R.id.word_list_recycler_view);
        rv.setLayoutManager(lm);// กำหนด layout manager ให้กับ RecycclerView
        rv.setAdapter(adapter);//กำหนด adapter ให้กับ RecycclerView

    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
        Worditem[] item = {
                 new Worditem(R.drawable.one,"จังหวัด กระบี่\nคำขวัญ :เมืองน่าอยู่ ผู้คนน่ารัก"),
                 new Worditem(R.drawable.two,"จังหวัด กาญจนบุรี\nคำขวัญ : แคว้นโบราณ ด่านเจดีย์ มณีเมืองกาญจน์ \n" +
                         "สะพานข้ามแม่น้ำแคว แหล่งแร่น้ำตก\n"),
                new Worditem(R.drawable.thee,"จังหวัด กรุงเทพมหานคร\nคำขวัญ : ช่วยชุมชนแออัด ขจัดมลพิษ\n" +
                        "แก้ปัญหารถติด ทุกชีวิตรื่นรมย์\n"),
                new Worditem(R.drawable.four,"จังหวัด กำแพงเพชร\nคำขวัญ :กรุพระเครื่อง เมืองคนแกร่ง\n" +
                        "ศิลาแลงใหญ่ กล้วยไข่หวาน น้ำมันลานกระบือ\n"),
                new Worditem(R.drawable.five,"จังหวัด ขอนแก่น\nคำขวัญ : พระธาตุขามแก่น เสียงแคนดอกคูณ\n" +
                        "ศูนย์รวมผ้าไหม ร่วมใจผูกเสี่ยว\n" +
                        "เที่ยวขอนแก่นนครใหญ่ ไดโนเสาร์ลือก้อง\n" +
                        "เหรียญทองมวยโอลิมปิค\n"),
                new Worditem(R.drawable.six,"จังหวัด ชลบุรี\nคำขวัญ : ทะเลงาม ข้าวหลามอร่อย อ้อยหวาน\n" +
                        "จักสานดี ประเพณีวิ่งควาย\n"),
                new Worditem(R.drawable.seven,"จังหวัด เชียงราย\nคำขวัญ : เหนือสุดยอดในสยาม ชายแดนสาม\n" +
                        "แผ่นดิน ถิ่นวัฒนธรรมล้านนา\n"),
                new Worditem(R.drawable.eight,"จังหวัด เชียงใหม่\nคำขวัญ : ดอยสุเทพเป็นศรี ประเพณีเป็นสง่า\n" +
                        "บุปผาชาติล้วนงามตา นามล้ำค่านครพิงค์\n"),
                new Worditem(R.drawable.nine,"จังหวัด นครปฐม\nคำขวัญ : ส้มโอหวาน ข้าวสารขาว ลูกสาวงาม\n" +
                        "ข้าวหลามหวานมัน สนามจันทร์งามล้น\n" +
                        "พุทธมณฑลคู่ธานี พระปฐมเจดีย์เสียดฟ้า\n"),
                new Worditem(R.drawable.ten,"จังหวัด ภูเก็ต\nคำขวัญ : ไข่มุกอันดามัน สวรรค์เมืองใต้ หาดทราย\n" +
                        "สีทอง สองวีรสตรี บารมีหลวงพ่อแช่ม\n"),
        };

        public MyAdapter(){

        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_word, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;

        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

                holder.imageView.setImageResource(item[position].imageResId);
                holder.wordTextView.setText(item[position].word);





        }

        @Override
        public int getItemCount() {
            return item.length;
        }

         class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView wordTextView;

            public MyViewHolder(@NonNull View itemView){
                super(itemView);
                imageView = itemView.findViewById(R.id.image_View);
                wordTextView = itemView.findViewById(R.id.word_text_View);
            }
        }
    }
}

