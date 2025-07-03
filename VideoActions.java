public class VideoActions{
    public static void main(String[] args){
        System.out.println("Main Method");

        
        Authentication authObj = new Authentication();
        authObj.Login();
        Cart cartObj = new Cart();
        cartObj.AddToCart();
        VideoActions VA=new VideoActions();
        VA.Like();
        VA.Dislike();

    }


    public void Like(){
        System.out.println("Video Liked");
    }

    public void Dislike(){
        System.out.println("Video UnLiked");
    }
}

