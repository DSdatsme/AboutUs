package mehdi.sakout.aboutpage.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        View aboutPage = new AboutPage(this)
                //.isRTL(false)                         //i dont know what is this
                .setImage(R.drawable.ggz)                   // TODO: 04-03-2017 image hav to be made small with the dimensions of @drawable/dumy_image
                //.addGroup("Connect with us")          //to add a group in future.
                .addEmail("GeekGamerz2017@gmail.com")
                .addFacebook("GeekGamerz2017")
                .addTwitter("GeekGamerz2017")
                .addPlayStore("com.ideashower.readitlater.pro")   // TODO: 04-03-2017 developer id to be added here
                .addItem(getCopyRightsElement())
                .create();

        setContentView(aboutPage);
    }


    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.about_icon_copy_right);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }
}
