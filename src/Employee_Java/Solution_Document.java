package Employee_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution_Document {
    public static Document[] docsWithOddPages(Document [] objects){
        ArrayList<Document> list= new ArrayList<>();
        for(Document doc : objects){
            if(doc.getPages() % 2 !=0){
                list.add(doc);
            }
        }
        Document [] res = new Document[list.size()];
        list.toArray(res);
        Arrays.sort(res, Comparator.comparingInt(Document :: getId) );
        return  res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document [] docs = new Document[4];
        for(int i = 0 ; i < 4 ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String folderName = sc.nextLine();
            int pages = sc.nextInt();
            sc.nextLine();
            docs[i] = new Document(id,title,folderName,pages);
        }
        Document [] res = docsWithOddPages(docs);
        for(Document i : res){
            System.out.println("id = "+ i.getId());
            System.out.println("Title = " + i.getTitle());
            System.out.println("FolderName = "+ i.getFolderName());
            System.out.println("Pages = "+ i.getPages());
        }
    }

}
