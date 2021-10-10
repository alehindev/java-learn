public class Analyzer {
    public static void main(String[] args){
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.print(printTextPerRole(roles,textLines));
    }
    private static String printTextPerRole(String[] roles, String[] textLines){
        StringBuilder res = new StringBuilder("");
        boolean[] used_roles = new boolean[roles.length];
        for(int role = 0; role < roles.length; role++) {
            res.append(roles[role]+":\n");
            for(int i = 0; i < textLines.length; i++){
                if(textLines[i].indexOf(roles[role]+":") == 0) {
                   used_roles[role] = true;
                    res.append((i+1)+") "+textLines[i].substring(roles[role].length()+2)+'\n');
                }
            }
            res.append("\n");
        }

        return res.toString();
    }
}