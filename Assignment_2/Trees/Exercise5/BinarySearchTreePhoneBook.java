package Exercise5;

import javax.swing.tree.TreeNode;

import Exercise5.Exercise5.PhoneBook;

public class BinarySearchTreePhoneBook implements PhoneBook{
    /**
    * @return The number of entries in this phone book.
    */
    public int size(TreeNode node)
    {
        if (node == null) {
            return 0;
        }
        return sizeHelper(node) + 1;
        
    }
    public int sizeHelper(TreeNode node){
        if (node == null) {return 0;}
        else
        return(size(node.left) + size(node.right));
    }
    /**
    * Inserts an entry in this phone book.
    * @param name The name for the entry.
    * @param phoneNumber The phone number for the entry.
    */
    public void insert(String name, long phoneNumber){
        TreeNode node = new TreeNode(new ArrayList(String name, long phoneNumber));
        if(root == null){
            root = node;
        } else if(node[1] < root.phoneNumber){
            root.left = insert(root.left, node);
        } else if(node[1] > root.phoneNumber){
            root.right = insert(root.right, node);
        }
    }
    /**
    * Returns the phone number associated with a name in the phone
    book.
    * @param name The name to search for.
    * @return The phone number for the entry, or -1 if the name is not
    present in the phone book.
    */
    public long find(String name){
        if(root == null){
            root = node;
        } else if(node.name] < root.name){
            root.left = find(root.left, node);
        } else if(node.name > root.name){
            root.right = find(root.right, node);
        } else if (node.name == root.name) {
            return true;
        }
        return false;
    }

}
