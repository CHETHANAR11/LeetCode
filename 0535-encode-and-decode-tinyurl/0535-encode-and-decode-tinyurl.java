public class Codec {
        Map<String,String> mp;int n=0;
    public Codec(){
        mp=new HashMap<>();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        n++;
        StringBuilder ans=new StringBuilder();
        ans.append("http://tinyurl.com/");
        ans.append(n);
        mp.put(longUrl,ans.toString());
        return ans.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        for(Map.Entry<String,String>  entry:mp.entrySet()){
            if(entry.getValue().equals(shortUrl)){
                return entry.getKey();
            }
        }
        return "";
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));