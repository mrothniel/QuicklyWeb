import { Component, OnInit, Input } from '@angular/core';

@Component({
    selector: 'app-stat',
    templateUrl: './stat.component.html',
    styleUrls: ['./stat.component.scss']
})
export class StatComponent implements OnInit {
    @Input() bgClass: string;
    @Input() icon: string;
    @Input() label: string;
    @Input() content: string;

    constructor() {}

    ngOnInit() {}
}
