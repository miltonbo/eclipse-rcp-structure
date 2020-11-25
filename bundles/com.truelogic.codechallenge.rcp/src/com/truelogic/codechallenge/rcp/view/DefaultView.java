package com.truelogic.codechallenge.rcp.view;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DefaultView {
	
	@PostConstruct
	public void init(Composite composite, Shell shell, IWorkbench workbench, final IProvisioningAgent agent, final UISynchronize sync) {
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setBounds(0, 0, 448, 599);
		composite_1.setLayout(new FormLayout());

		Composite composite_3 = new Composite(composite_1, SWT.NONE);
		FormData fd_composite_3 = new FormData();
		fd_composite_3.left = new FormAttachment(0, 5);
		fd_composite_3.right = new FormAttachment(100);
		fd_composite_3.bottom = new FormAttachment(0, 554);
		fd_composite_3.top = new FormAttachment(0, 5);
		composite_3.setLayoutData(fd_composite_3);
		composite_3.setLayout(new FillLayout(SWT.HORIZONTAL));

		SashForm sashForm = new SashForm(composite_3, SWT.VERTICAL);
		sashForm.setLayout(new FillLayout(SWT.VERTICAL));

		Group composite_4 = new Group(sashForm, SWT.NONE);
		composite_4.setText("Sum Function");
		composite_4.setLayout(new FormLayout());

		Composite grpLeft = new Composite(composite_4, SWT.NONE);
		FormData fd_grpLeft = new FormData();
		fd_grpLeft.left = new FormAttachment(0, 3);
		fd_grpLeft.bottom = new FormAttachment(100);
		fd_grpLeft.right = new FormAttachment(100);
		fd_grpLeft.top = new FormAttachment(0, 3);
		grpLeft.setLayoutData(fd_grpLeft);
		grpLeft.setFont(SWTResourceManager.getFont("Noto Sans", 10, SWT.BOLD));

		Label lblNit = new Label(grpLeft, SWT.NONE);
		lblNit.setFont(SWTResourceManager.getFont("Noto Sans", 12, SWT.NORMAL));
		lblNit.setText("Value 1");
		lblNit.setBounds(10, 13, 160, 18);

		Text text = new Text(grpLeft, SWT.SINGLE | SWT.BORDER);
		text.setBounds(250, 10, 300, 30);
		text.setFocus();
		text.setTextLimit(13);

		Text text_1 = new Text(grpLeft, SWT.SINGLE | SWT.BORDER);
		text_1.setBounds(250, 63, 300, 30);
		text_1.setTextLimit(100);
		
		Label lblNombreORazn = new Label(grpLeft, SWT.WRAP);
		lblNombreORazn.setText("Value 2");
		lblNombreORazn.setFont(SWTResourceManager.getFont("Noto Sans", 10, SWT.NORMAL));
		lblNombreORazn.setBounds(10, 67, 200, 18);

	}
	
}
