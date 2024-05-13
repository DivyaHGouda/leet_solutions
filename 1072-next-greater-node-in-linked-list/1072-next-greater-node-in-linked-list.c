/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextLargerNodes(struct ListNode* head, int* returnSize) {
    struct ListNode* temp=head;
    int l=0;
    while(temp!=NULL){
        l++;
        temp=temp->next;
    }
    int *a=(int*)malloc(sizeof(int)*l);
    *returnSize=l;
    temp=head;
    int i=0;
    struct ListNode* temp1=NULL;
    while(temp!=NULL){
        temp1=temp->next;
        while(temp1!=NULL){
            if(temp->val<temp1->val){
                a[i]=temp1->val;
                i++;
                break;
            }
            temp1=temp1->next;    
        }
        if(temp1==NULL){
            a[i]=0;
            i++;
        }
        temp=temp->next;    
    }
    return a;
}