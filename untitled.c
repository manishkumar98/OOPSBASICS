if((str[i]=='}')||(str[i]==')')||(str[i]==']'))
		
		{
			res=pop();
			printf("Res here%c",res);
			if((str[i]=='}'&&res!='{')||(str[i]==')'&&res!='(')||(str[i]==']'&&res!='[')){
				f=1;
			}
			

		}








		char pop(){
	b=s[top];
	printf("%c",b);
	top--;

	return b;
}