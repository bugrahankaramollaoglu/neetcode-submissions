class Solution {
    public boolean isAnagram(String s, String t) {
        // ilk kontrolleri yapiyoruz
        if (s.length() != t.length())
            return false;

        // normalde hashmap de kullanabilirdik ama
        // sadece lowercase english oldugunu bildigimiz icin
        // daha verimli olan int[26] kullanacagiz
        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }

        // eger ikisi anagram ise, []'in her elemani 0 olmali
        for (int check : chars) {
            if (check != 0)
                return false;
        }

        return true;
    }

    public boolean isAnagramWithHashmap(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> hmap = new HashMap<>();

        // birinci stringe göre mapi doldurduk
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }

        // ikinci stringe göre çıkaracağız
        for (int i = 0; i < t.length() ; i++) {
            char ch = t.charAt(i);

            // eğer aranan karakter (s[i]) t'de yoksa
            // ya da daha önce kullandıysak
            if (!hmap.containsKey(ch) || hmap.get(ch) == 0) return false;

            hmap.put(ch, hmap.getOrDefault(ch, 0) - 1);
        }

        return true;

    }
}
