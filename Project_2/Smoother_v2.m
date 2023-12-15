% do a run of plotter_v2 and salter_v2 first
close all

% coder changes the case number for every case
filecreate = fopen("salter_case2.csv","r");

label = fscanf(filecreate,'%s,%s',[2 1]);
setA = fscanf(filecreate, '%f,%f',[2,maxrangenum]);
setA = setA';

xvalues = setA(:,1);
y = setA(:,2);

%tempname = movmean(y,5);
tempname = movmean(y,6000);
y = tempname
setA(:,2) = y;

fprintf(filecreate, '%f,%f\n', setA');
plot(xvalues,y);
set(gca, lineWidth=1,fontsize=14);
xlabel("X values");
ylabel("y");
% coder changes the case number for every case
title("Smoother Graph 2");
grid on

% coder changes the case number for every case
filecreate2 = fopen("smoothing_case2.csv","w");
%creates the first line of file
fprintf(filecreate2,'%s,%s\n','X','Y');
fprintf(filecreate2, '%f,%f\n', setA');

fclose(filecreate);
fclose(filecreate2);