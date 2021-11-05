# Basic_Phrases

play sounds based on the button clicked. each button has a tag refered to the file name of the audio to make it easier to code

like "audioBtn.getTag().toString()" 

//define media player

MediaPlayer mediaPlayer;

//start the audio using button tag as the name of the audio

mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(audioBtn.getTag().toString(), "raw", getPackageName()));

mediaPlayer.start();
