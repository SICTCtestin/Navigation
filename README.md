# Navigation
Group project consisting of Kai, Mason, Tyler, and Scott

--NAVAPP--

This will allow you to understand how to change images through buttons

First step you will need is to be able to add images to the drawable folder. 
DO NOT add the images to the drawable v-24 folder or the results may not be consistent.
First step take the file and drag it into the drawable folder, or copy and paste it into the folder. 
Then add the path to the drawable file. Make sure the image is only in lowercase letters without spaces.

Now that the image file has been added, you will need to create a function to call the button, we used the following: 

```java

private void graphicMap(){

        image.setImageResource(R.drawable.graphicmap);
        
    }
    
```
![image](https://user-images.githubusercontent.com/71509618/146058013-33a4cef2-a66b-4231-8fa0-a501826440b2.png)

    
This is called whenever the user clicks on a button, we call it in the following:
    
```java
    
        weldingBTN=findViewById(R.id.weldingBTN);
        weldingBTN.setOnClickListener(new View.OnClickListener() {
        
            @Override
            public void onClick(View view) {
                weldingMap();
                } 
```
![image](https://user-images.githubusercontent.com/71509618/146058368-7444aa00-225f-4a10-b522-64618795a593.png)

                
This will allow you to call a button through on click listener and switch the images on the navapp
