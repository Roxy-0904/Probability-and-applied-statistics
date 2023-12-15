%minrangenum = 0;
%maxrangenum = 50;
minrangenum = 2;
maxrangenum = 100;

% coder changes the case number for every case
filecreate = fopen("plotting_case2.csv","w");

xvalues = (minrangenum:maxrangenum+1)';
y = 2*(xvalues.^2)+5*xvalues-10;

setA = horzcat(xvalues,y);
%creates the first line of file
fprintf(filecreate,'%s,%s\n','X','Y');

fprintf(filecreate, '%f,%f\n', setA);
plot(xvalues,y);
set(gca, lineWidth=1,fontsize=14);
xlabel("X values");
ylabel("y");
% coder changes the case number for every case
title("Plotting Graph 2");
grid on

fclose(filecreate);