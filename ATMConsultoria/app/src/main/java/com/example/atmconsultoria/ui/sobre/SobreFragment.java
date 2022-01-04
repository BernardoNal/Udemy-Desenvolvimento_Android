package com.example.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String String="kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        Element versionElement = new Element();
        versionElement.setTitle("versão NAL");

        return  new AboutPage(getActivity())
                .isRTL(false)
              //  .enableDarkMode(false)
                .setDescription(String) // or Typeface
                .setImage(R.drawable.logo)
                .addItem(versionElement)
               // .addItem(adsElement)
               .addGroup("Connect with us")
                .addEmail("elmehdi.sakout@gmail.com")
                .addWebsite("https://mehdisakout.com/")
                .addFacebook("the.medy")
                .addTwitter("medyo80")
                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
                .addPlayStore("com.ideashower.readitlater.pro")
                .addGitHub("medyo")
                .addInstagram("medyo80")
                .create();
       // return inflater.inflate(R.layout.fragment_sobre, container, false);

    }
}